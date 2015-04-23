
  package gen;
  public class Y_Gen86 {
  		@com.google.inject.Inject
  		public Y_Gen86(Y_Gen87 y_gen87){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen87 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  