
  package gen;
  public class Q_Gen183 {
  		@com.google.inject.Inject
  		public Q_Gen183(Q_Gen184 q_gen184){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen184 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  