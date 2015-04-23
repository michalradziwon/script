
  package gen;
  public class B_Gen108 {
  		@com.google.inject.Inject
  		public B_Gen108(B_Gen109 b_gen109){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen109 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  