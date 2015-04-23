
  package gen;
  public class Y_Gen15 {
  		@com.google.inject.Inject
  		public Y_Gen15(Y_Gen16 y_gen16){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen16 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  