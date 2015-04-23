
  package gen;
  public class B_Gen143 {
  		@com.google.inject.Inject
  		public B_Gen143(B_Gen144 b_gen144){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen144 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  