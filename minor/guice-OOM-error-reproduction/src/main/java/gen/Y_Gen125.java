
  package gen;
  public class Y_Gen125 {
  		@com.google.inject.Inject
  		public Y_Gen125(Y_Gen126 y_gen126){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen126 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  