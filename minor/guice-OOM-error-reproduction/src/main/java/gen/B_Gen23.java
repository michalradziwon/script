
  package gen;
  public class B_Gen23 {
  		@com.google.inject.Inject
  		public B_Gen23(B_Gen24 b_gen24){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen24 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  