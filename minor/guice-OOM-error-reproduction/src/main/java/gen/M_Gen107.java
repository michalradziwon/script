
  package gen;
  public class M_Gen107 {
  		@com.google.inject.Inject
  		public M_Gen107(M_Gen108 m_gen108){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen108 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  