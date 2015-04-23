
  package gen;
  public class B_Gen95 {
  		@com.google.inject.Inject
  		public B_Gen95(B_Gen96 b_gen96){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen96 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  