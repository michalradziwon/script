
  package gen;
  public class B_Gen141 {
  		@com.google.inject.Inject
  		public B_Gen141(B_Gen142 b_gen142){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen142 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  