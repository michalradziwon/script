
  package gen;
  public class B_Gen4 {
  		@com.google.inject.Inject
  		public B_Gen4(B_Gen5 b_gen5){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen5 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  