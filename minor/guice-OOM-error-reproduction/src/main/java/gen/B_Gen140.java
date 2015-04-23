
  package gen;
  public class B_Gen140 {
  		@com.google.inject.Inject
  		public B_Gen140(B_Gen141 b_gen141){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen141 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  