
  package gen;
  public class B_Gen87 {
  		@com.google.inject.Inject
  		public B_Gen87(B_Gen88 b_gen88){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen88 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  