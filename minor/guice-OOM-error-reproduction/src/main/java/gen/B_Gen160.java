
  package gen;
  public class B_Gen160 {
  		@com.google.inject.Inject
  		public B_Gen160(B_Gen161 b_gen161){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen161 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  