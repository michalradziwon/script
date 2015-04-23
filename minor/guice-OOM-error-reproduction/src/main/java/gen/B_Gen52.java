
  package gen;
  public class B_Gen52 {
  		@com.google.inject.Inject
  		public B_Gen52(B_Gen53 b_gen53){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen53 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  