
  package gen;
  public class Q_Gen102 {
  		@com.google.inject.Inject
  		public Q_Gen102(Q_Gen103 q_gen103){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen103 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  