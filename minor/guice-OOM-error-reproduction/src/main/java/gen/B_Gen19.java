
  package gen;
  public class B_Gen19 {
  		@com.google.inject.Inject
  		public B_Gen19(B_Gen20 b_gen20){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen20 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  