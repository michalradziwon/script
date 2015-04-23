
  package gen;
  public class Q_Gen184 {
  		@com.google.inject.Inject
  		public Q_Gen184(Q_Gen185 q_gen185){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen185 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  