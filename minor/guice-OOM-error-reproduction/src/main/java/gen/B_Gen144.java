
  package gen;
  public class B_Gen144 {
  		@com.google.inject.Inject
  		public B_Gen144(B_Gen145 b_gen145){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen145 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  