
  package gen;
  public class B_Gen62 {
  		@com.google.inject.Inject
  		public B_Gen62(B_Gen63 b_gen63){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen63 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  