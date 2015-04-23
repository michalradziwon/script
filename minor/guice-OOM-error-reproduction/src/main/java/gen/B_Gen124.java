
  package gen;
  public class B_Gen124 {
  		@com.google.inject.Inject
  		public B_Gen124(B_Gen125 b_gen125){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen125 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  