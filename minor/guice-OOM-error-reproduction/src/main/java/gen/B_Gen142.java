
  package gen;
  public class B_Gen142 {
  		@com.google.inject.Inject
  		public B_Gen142(B_Gen143 b_gen143){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen143 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  