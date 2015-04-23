
  package gen;
  public class B_Gen177 {
  		@com.google.inject.Inject
  		public B_Gen177(B_Gen178 b_gen178){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen178 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  