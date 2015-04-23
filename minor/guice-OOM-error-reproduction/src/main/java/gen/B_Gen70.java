
  package gen;
  public class B_Gen70 {
  		@com.google.inject.Inject
  		public B_Gen70(B_Gen71 b_gen71){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen71 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  