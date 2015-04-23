
  package gen;
  public class B_Gen127 {
  		@com.google.inject.Inject
  		public B_Gen127(B_Gen128 b_gen128){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen128 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  