
  package gen;
  public class B_Gen181 {
  		@com.google.inject.Inject
  		public B_Gen181(B_Gen182 b_gen182){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen182 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  