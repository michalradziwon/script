
  package gen;
  public class B_Gen163 {
  		@com.google.inject.Inject
  		public B_Gen163(B_Gen164 b_gen164){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen164 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  