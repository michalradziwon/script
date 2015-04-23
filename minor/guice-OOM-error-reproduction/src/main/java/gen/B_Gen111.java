
  package gen;
  public class B_Gen111 {
  		@com.google.inject.Inject
  		public B_Gen111(B_Gen112 b_gen112){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen112 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  