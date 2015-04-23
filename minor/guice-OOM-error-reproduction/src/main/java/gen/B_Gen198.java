
  package gen;
  public class B_Gen198 {
  		@com.google.inject.Inject
  		public B_Gen198(B_Gen199 b_gen199){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen199 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  