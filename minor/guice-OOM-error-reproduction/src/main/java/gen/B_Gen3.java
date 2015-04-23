
  package gen;
  public class B_Gen3 {
  		@com.google.inject.Inject
  		public B_Gen3(B_Gen4 b_gen4){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen4 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  