
  package gen;
  public class B_Gen105 {
  		@com.google.inject.Inject
  		public B_Gen105(B_Gen106 b_gen106){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen106 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  