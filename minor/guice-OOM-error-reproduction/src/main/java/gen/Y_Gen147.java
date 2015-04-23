
  package gen;
  public class Y_Gen147 {
  		@com.google.inject.Inject
  		public Y_Gen147(Y_Gen148 y_gen148){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen148 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  