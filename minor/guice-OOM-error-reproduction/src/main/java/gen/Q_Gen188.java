
  package gen;
  public class Q_Gen188 {
  		@com.google.inject.Inject
  		public Q_Gen188(Q_Gen189 q_gen189){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen189 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  