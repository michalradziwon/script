
  package gen;
  public class B_Gen76 {
  		@com.google.inject.Inject
  		public B_Gen76(B_Gen77 b_gen77){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen77 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  