
  package gen;
  public class B_Gen1 {
  		@com.google.inject.Inject
  		public B_Gen1(B_Gen2 b_gen2){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen2 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  