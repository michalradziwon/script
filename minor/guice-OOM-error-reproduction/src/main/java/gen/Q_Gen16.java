
  package gen;
  public class Q_Gen16 {
  		@com.google.inject.Inject
  		public Q_Gen16(Q_Gen17 q_gen17){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen17 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  