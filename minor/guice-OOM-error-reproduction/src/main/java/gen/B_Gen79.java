
  package gen;
  public class B_Gen79 {
  		@com.google.inject.Inject
  		public B_Gen79(B_Gen80 b_gen80){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen80 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  