
  package gen;
  public class B_Gen38 {
  		@com.google.inject.Inject
  		public B_Gen38(B_Gen39 b_gen39){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen39 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  