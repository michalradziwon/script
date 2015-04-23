
  package gen;
  public class B_Gen45 {
  		@com.google.inject.Inject
  		public B_Gen45(B_Gen46 b_gen46){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen46 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  