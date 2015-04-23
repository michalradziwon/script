
  package gen;
  public class Y_Gen85 {
  		@com.google.inject.Inject
  		public Y_Gen85(Y_Gen86 y_gen86){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen86 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  