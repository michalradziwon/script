
  package gen;
  public class B_Gen90 {
  		@com.google.inject.Inject
  		public B_Gen90(B_Gen91 b_gen91){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen91 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  