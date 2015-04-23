
  package gen;
  public class B_Gen94 {
  		@com.google.inject.Inject
  		public B_Gen94(B_Gen95 b_gen95){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen95 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  