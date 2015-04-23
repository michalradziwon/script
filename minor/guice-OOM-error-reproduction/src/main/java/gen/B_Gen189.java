
  package gen;
  public class B_Gen189 {
  		@com.google.inject.Inject
  		public B_Gen189(B_Gen190 b_gen190){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen190 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  