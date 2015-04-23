
  package gen;
  public class B_Gen128 {
  		@com.google.inject.Inject
  		public B_Gen128(B_Gen129 b_gen129){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen129 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  