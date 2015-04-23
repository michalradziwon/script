
  package gen;
  public class Q_Gen122 {
  		@com.google.inject.Inject
  		public Q_Gen122(Q_Gen123 q_gen123){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen123 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  