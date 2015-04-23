
  package gen;
  public class B_Gen147 {
  		@com.google.inject.Inject
  		public B_Gen147(B_Gen148 b_gen148){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen148 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  