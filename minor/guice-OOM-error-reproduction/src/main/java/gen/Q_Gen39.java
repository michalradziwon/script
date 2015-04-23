
  package gen;
  public class Q_Gen39 {
  		@com.google.inject.Inject
  		public Q_Gen39(Q_Gen40 q_gen40){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen40 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  