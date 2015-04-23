
  package gen;
  public class B_Gen180 {
  		@com.google.inject.Inject
  		public B_Gen180(B_Gen181 b_gen181){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen181 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  