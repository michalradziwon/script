
  package gen;
  public class B_Gen145 {
  		@com.google.inject.Inject
  		public B_Gen145(B_Gen146 b_gen146){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen146 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  