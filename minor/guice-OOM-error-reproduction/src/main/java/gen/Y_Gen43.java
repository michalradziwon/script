
  package gen;
  public class Y_Gen43 {
  		@com.google.inject.Inject
  		public Y_Gen43(Y_Gen44 y_gen44){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen44 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  