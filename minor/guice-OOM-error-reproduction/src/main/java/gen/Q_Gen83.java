
  package gen;
  public class Q_Gen83 {
  		@com.google.inject.Inject
  		public Q_Gen83(Q_Gen84 q_gen84){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen84 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  