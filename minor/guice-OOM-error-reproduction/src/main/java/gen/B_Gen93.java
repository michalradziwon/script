
  package gen;
  public class B_Gen93 {
  		@com.google.inject.Inject
  		public B_Gen93(B_Gen94 b_gen94){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen94 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  