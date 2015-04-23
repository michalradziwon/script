
  package gen;
  public class B_Gen86 {
  		@com.google.inject.Inject
  		public B_Gen86(B_Gen87 b_gen87){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen87 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  