
  package gen;
  public class B_Gen112 {
  		@com.google.inject.Inject
  		public B_Gen112(B_Gen113 b_gen113){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen113 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  