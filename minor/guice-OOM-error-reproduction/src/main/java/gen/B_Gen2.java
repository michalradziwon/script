
  package gen;
  public class B_Gen2 {
  		@com.google.inject.Inject
  		public B_Gen2(B_Gen3 b_gen3){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen3 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  